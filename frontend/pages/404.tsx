import React from 'react';
import NotFound from '/pages/pages/notfound/index';
import { Page } from '/types/types';

const Custom404: Page = () => {
    return <NotFound />;
};
const x=0;
Custom404.getLayout = function getLayout(page) {
    return page;
};

export default Custom404;
