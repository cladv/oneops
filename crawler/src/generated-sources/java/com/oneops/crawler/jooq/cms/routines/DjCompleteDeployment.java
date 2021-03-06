/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DjCompleteDeployment extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 385611839;

    /**
     * The parameter <code>kloopzcm.dj_complete_deployment.p_deployment_id</code>.
     */
    public static final Parameter<Long> P_DEPLOYMENT_ID = createParameter("p_deployment_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public DjCompleteDeployment() {
        super("dj_complete_deployment", Kloopzcm.KLOOPZCM);

        addInParameter(P_DEPLOYMENT_ID);
    }

    /**
     * Set the <code>p_deployment_id</code> parameter IN value to the routine
     */
    public void setPDeploymentId(Long value) {
        setValue(P_DEPLOYMENT_ID, value);
    }
}
