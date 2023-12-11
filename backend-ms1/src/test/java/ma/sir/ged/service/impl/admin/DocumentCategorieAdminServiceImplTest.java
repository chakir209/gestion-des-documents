package ma.sir.ged.service.impl.admin;

import ma.sir.ged.bean.core.DocumentCategorie;
import ma.sir.ged.bean.core.DocumentCategorieIndex;
import ma.sir.ged.bean.core.DocumentCategorieModel;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class DocumentCategorieAdminServiceImplTest {
 private final DocumentCategorieAdminServiceImpl  documentCategorieAdminService;
    private Object documentCategorieIndexService;
    private Object documentCategorieModelService;

    DocumentCategorieAdminServiceImplTest(DocumentCategorieAdminServiceImpl documentCategorieAdminService) {
        this.documentCategorieAdminService = documentCategorieAdminService;
    }

    @Test
    public void testCreateDocumentCategorie() {
        // Arrange
        DocumentCategorie documentCategorie = new DocumentCategorie();
        DocumentCategorieIndex documentCategorieIndex = new DocumentCategorieIndex();
        DocumentCategorieModel documentCategorieModel = new DocumentCategorieModel();
        documentCategorie.setDocumentCategorieIndexs(Arrays.asList(documentCategorieIndex));
        documentCategorie.setDocumentCategorieModels(Arrays.asList(documentCategorieModel));
        DocumentCategorie result = documentCategorieAdminService.create(documentCategorie);
        assertEquals(documentCategorie, result);
        // Verify that the create method was called with the correct argument
        Object documentCategorieRepository = null;
        //verify(documentCategorieRepository).create(documentCategorie);
        // Verify that the create method of DocumentCategorieIndexService was called with the correct argument
       // verify(documentCategorieIndexService).create(documentCategorieIndex);
        // Verify that the create method of DocumentCategorieModelService was called with the correct argument
      //  verify(documentCategorieModelService).create(documentCategorieModel);
    }

    @Test
    void findWithAssociatedLists() {
    }
}