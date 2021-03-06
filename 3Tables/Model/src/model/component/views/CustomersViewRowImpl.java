package model.component.views;

import java.math.BigDecimal;

import model.component.entities.common.CustAddressTyp;

import oracle.jbo.domain.Array;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 24 17:07:08 BST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CustomersViewRowImpl extends ViewRowImpl {
    public static final int ENTITY_CUSTOMERS = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        CustomerId,
        CustFirstName,
        CustLastName,
        CustAddress,
        PhoneNumbers,
        NlsLanguage,
        NlsTerritory,
        CreditLimit,
        CustEmail,
        AccountMgrId;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static final int CUSTFIRSTNAME = AttributesEnum.CustFirstName.index();
    public static final int CUSTLASTNAME = AttributesEnum.CustLastName.index();
    public static final int CUSTADDRESS = AttributesEnum.CustAddress.index();
    public static final int PHONENUMBERS = AttributesEnum.PhoneNumbers.index();
    public static final int NLSLANGUAGE = AttributesEnum.NlsLanguage.index();
    public static final int NLSTERRITORY = AttributesEnum.NlsTerritory.index();
    public static final int CREDITLIMIT = AttributesEnum.CreditLimit.index();
    public static final int CUSTEMAIL = AttributesEnum.CustEmail.index();
    public static final int ACCOUNTMGRID = AttributesEnum.AccountMgrId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CustomersViewRowImpl() {
    }
}

