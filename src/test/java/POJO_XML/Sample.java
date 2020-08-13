package POJO_XML;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import Utils.XML_TO_POJO_CONVERTER;

public class Sample 
{
	public static void main(String[] args) throws JAXBException 
	{
		String s1 = "<account>\r\n" + 
				"	<id>853058</id>\r\n" + 
				"	<statusCodesList>\r\n" + 
				"		<statusCodes>\r\n" + 
				"			<code>FR</code>\r\n" + 
				"			<result>Y</result>\r\n" + 
				"		</statusCodes>\r\n" + 
				"		<statusCodes>\r\n" + 
				"			<code>SF</code>\r\n" + 
				"			<result>IF</result>\r\n" + 
				"		</statusCodes>\r\n" + 
				"		<statusCodes>\r\n" + 
				"			<code>XF</code>\r\n" + 
				"			<result>06</result>\r\n" + 
				"		</statusCodes>\r\n" + 
				"		<statusCodes>\r\n" + 
				"			<code>CV</code>\r\n" + 
				"			<result>Y</result>\r\n" + 
				"		</statusCodes>\r\n" + 
				"		<statusCodes>\r\n" + 
				"			<code>PG</code>\r\n" + 
				"			<result>Y</result>\r\n" + 
				"		</statusCodes>\r\n" + 
				"		<statusCodes>\r\n" + 
				"			<code>BC</code>\r\n" + 
				"			<result>01</result>\r\n" + 
				"		</statusCodes>\r\n" + 
				"		<statusCodes>\r\n" + 
				"			<code>RE</code>\r\n" + 
				"			<result>00</result>\r\n" + 
				"		</statusCodes>\r\n" + 
				"		<statusCodes>\r\n" + 
				"			<code>NP</code>\r\n" + 
				"			<result>Y</result>\r\n" + 
				"		</statusCodes>\r\n" + 
				"		<statusCodes>\r\n" + 
				"			<code>VP</code>\r\n" + 
				"			<result>1</result>\r\n" + 
				"		</statusCodes>\r\n" + 
				"		<statusCodes>\r\n" + 
				"			<code>EM</code>\r\n" + 
				"			<result>M</result>\r\n" + 
				"		</statusCodes>\r\n" + 
				"		<statusCodes>\r\n" + 
				"			<code>TA</code>\r\n" + 
				"			<result>P</result>\r\n" + 
				"		</statusCodes>\r\n" + 
				"		<statusCodes>\r\n" + 
				"			<code>SF</code>\r\n" + 
				"			<result>IF</result>\r\n" + 
				"		</statusCodes>\r\n" + 
				"	</statusCodesList>\r\n" + 
				"	<optOutsList>\r\n" + 
				"		<optOuts>\r\n" + 
				"			<category>01</category>\r\n" + 
				"			<flag>N</flag>\r\n" + 
				"		</optOuts>\r\n" + 
				"		<optOuts>\r\n" + 
				"			<category>02</category>\r\n" + 
				"			<flag>N</flag>\r\n" + 
				"		</optOuts>\r\n" + 
				"		<optOuts>\r\n" + 
				"			<category>03</category>\r\n" + 
				"			<flag>N</flag>\r\n" + 
				"		</optOuts>\r\n" + 
				"		<optOuts>\r\n" + 
				"			<category>04</category>\r\n" + 
				"			<flag>N</flag>\r\n" + 
				"		</optOuts>\r\n" + 
				"		<optOuts>\r\n" + 
				"			<category>05</category>\r\n" + 
				"			<flag>N</flag>\r\n" + 
				"		</optOuts>\r\n" + 
				"		<optOuts>\r\n" + 
				"			<category>06</category>\r\n" + 
				"			<flag>N</flag>\r\n" + 
				"		</optOuts>\r\n" + 
				"		<optOuts>\r\n" + 
				"			<category>07</category>\r\n" + 
				"			<flag>N</flag>\r\n" + 
				"		</optOuts>\r\n" + 
				"		<optOuts>\r\n" + 
				"			<category>08</category>\r\n" + 
				"			<flag>N</flag>\r\n" + 
				"		</optOuts>\r\n" + 
				"	</optOutsList>\r\n" + 
				"	<primaryCardholder>\r\n" + 
				"		<id>218667</id>\r\n" + 
				"		<name>LIAKIPEGA KIRK</name>\r\n" + 
				"		<cardNbr>5446122264335343</cardNbr>\r\n" + 
				"		<accountRelationship>0</accountRelationship>\r\n" + 
				"		<dateOfBirth>1970-08-17</dateOfBirth>\r\n" + 
				"		<sin>000000000</sin>\r\n" + 
				"		<cardActivated>Y</cardActivated>\r\n" + 
				"		<transferToCardNbr>5446122691741782</transferToCardNbr>\r\n" + 
				"		<emailAddress>LIANNE.KIRK@CTFS.COM</emailAddress>\r\n" + 
				"		<cardStatus>A</cardStatus>\r\n" + 
				"		<embossedName>LIAKIPEGA KIRK</embossedName>\r\n" + 
				"		<preferredLanguage>ENU</preferredLanguage>\r\n" + 
				"		<homePhone>2899294438</homePhone>\r\n" + 
				"		<workPhone>9057346729</workPhone>\r\n" + 
				"		<altPhone1>2899294438</altPhone1>\r\n" + 
				"		<homePhoneConsentInd>E</homePhoneConsentInd>\r\n" + 
				"		<altPhone2>2899294438</altPhone2>\r\n" + 
				"		<tokenCounter>0</tokenCounter>\r\n" + 
				"		<fisrtName>LIAKIPEGA</fisrtName>\r\n" + 
				"		<lastName>KIRK</lastName>\r\n" + 
				"		<regionCode>009</regionCode>\r\n" + 
				"		<address>\r\n" + 
				"			<line1>366 BUNTING ROAD</line1>\r\n" + 
				"			<city>ST CATHARINES</city>\r\n" + 
				"			<prov>ON</prov>\r\n" + 
				"			<postalZip>L2M3Y6</postalZip>\r\n" + 
				"			<country>CA</country>\r\n" + 
				"			<indicator>02</indicator>\r\n" + 
				"			<type>0</type>\r\n" + 
				"			<addressAddedDate>2019-12-23</addressAddedDate>\r\n" + 
				"		</address>\r\n" + 
				"		<addressAvailable>true</addressAvailable>\r\n" + 
				"		<pinLockedOut>false</pinLockedOut>\r\n" + 
				"		<cardReceiptVerification>Y</cardReceiptVerification>\r\n" + 
				"		<dateLastCardReq>2019-07-31</dateLastCardReq>\r\n" + 
				"		<statusCodesList>\r\n" + 
				"			<statusCodes>\r\n" + 
				"				<code>FR</code>\r\n" + 
				"				<result>Y</result>\r\n" + 
				"			</statusCodes>\r\n" + 
				"			<statusCodes>\r\n" + 
				"				<code>SF</code>\r\n" + 
				"				<result>IF</result>\r\n" + 
				"			</statusCodes>\r\n" + 
				"			<statusCodes>\r\n" + 
				"				<code>XF</code>\r\n" + 
				"				<result>06</result>\r\n" + 
				"			</statusCodes>\r\n" + 
				"			<statusCodes>\r\n" + 
				"				<code>CV</code>\r\n" + 
				"				<result>Y</result>\r\n" + 
				"			</statusCodes>\r\n" + 
				"			<statusCodes>\r\n" + 
				"				<code>PG</code>\r\n" + 
				"				<result>Y</result>\r\n" + 
				"			</statusCodes>\r\n" + 
				"			<statusCodes>\r\n" + 
				"				<code>BC</code>\r\n" + 
				"				<result>01</result>\r\n" + 
				"			</statusCodes>\r\n" + 
				"			<statusCodes>\r\n" + 
				"				<code>RE</code>\r\n" + 
				"				<result>00</result>\r\n" + 
				"			</statusCodes>\r\n" + 
				"			<statusCodes>\r\n" + 
				"				<code>NP</code>\r\n" + 
				"				<result>Y</result>\r\n" + 
				"			</statusCodes>\r\n" + 
				"			<statusCodes>\r\n" + 
				"				<code>VP</code>\r\n" + 
				"				<result>1</result>\r\n" + 
				"			</statusCodes>\r\n" + 
				"			<statusCodes>\r\n" + 
				"				<code>EM</code>\r\n" + 
				"				<result>M</result>\r\n" + 
				"			</statusCodes>\r\n" + 
				"			<statusCodes>\r\n" + 
				"				<code>TA</code>\r\n" + 
				"				<result>P</result>\r\n" + 
				"			</statusCodes>\r\n" + 
				"			<statusCodes>\r\n" + 
				"				<code>SF</code>\r\n" + 
				"				<result>IF</result>\r\n" + 
				"			</statusCodes>\r\n" + 
				"		</statusCodesList>\r\n" + 
				"		<dateEmailaddMaint>2020-05-15</dateEmailaddMaint>\r\n" + 
				"		<mandatoryInfoMissing>V</mandatoryInfoMissing>\r\n" + 
				"	</primaryCardholder>\r\n" + 
				"	<paymentHistory>\r\n" + 
				"		<pastDue30Nbr>0</pastDue30Nbr>\r\n" + 
				"		<pastDue60Nbr>0</pastDue60Nbr>\r\n" + 
				"		<pastDue90Nbr>0</pastDue90Nbr>\r\n" + 
				"		<pastDue120Nbr>0</pastDue120Nbr>\r\n" + 
				"		<pastDue150Nbr>0</pastDue150Nbr>\r\n" + 
				"		<pastDue180Nbr>0</pastDue180Nbr>\r\n" + 
				"		<pastDue210Nbr>0</pastDue210Nbr>\r\n" + 
				"		<pastDue240Nbr>0</pastDue240Nbr>\r\n" + 
				"		<pastDue270Nbr>0</pastDue270Nbr>\r\n" + 
				"		<pastDue300Nbr>0</pastDue300Nbr>\r\n" + 
				"		<pastDue330Nbr>0</pastDue330Nbr>\r\n" + 
				"		<pastDue330PlusNbr>0</pastDue330PlusNbr>\r\n" + 
				"		<currentCyclePaymentStatus>N</currentCyclePaymentStatus>\r\n" + 
				"		<paymentsCTDNbr>0</paymentsCTDNbr>\r\n" + 
				"		<paymentsCTDAmt>0.00</paymentsCTDAmt>\r\n" + 
				"		<paymentsYTDNbr>0</paymentsYTDNbr>\r\n" + 
				"	</paymentHistory>\r\n" + 
				"	<scores>\r\n" + 
				"		<amlScore>0000000</amlScore>\r\n" + 
				"		<summitScore>0000000</summitScore>\r\n" + 
				"		<fusionScore>0000000</fusionScore>\r\n" + 
				"	</scores>\r\n" + 
				"	<otherCardholdersList>\r\n" + 
				"		<otherCardholders>\r\n" + 
				"			<id>235236</id>\r\n" + 
				"			<name>*CARD SECURITY</name>\r\n" + 
				"			<cardNbr>5446122264335343</cardNbr>\r\n" + 
				"			<accountRelationship>5</accountRelationship>\r\n" + 
				"			<sin>00000000</sin>\r\n" + 
				"			<transferToCardNbr>5446122691741782</transferToCardNbr>\r\n" + 
				"			<fisrtName>*</fisrtName>\r\n" + 
				"			<lastName>CARD SECURITY</lastName>\r\n" + 
				"			<addressAvailable>true</addressAvailable>\r\n" + 
				"			<pinLockedOut>false</pinLockedOut>\r\n" + 
				"			<statusCodesList>\r\n" + 
				"				<statusCodes>\r\n" + 
				"					<code>FR</code>\r\n" + 
				"					<result>Y</result>\r\n" + 
				"				</statusCodes>\r\n" + 
				"				<statusCodes>\r\n" + 
				"					<code>SF</code>\r\n" + 
				"					<result>IF</result>\r\n" + 
				"				</statusCodes>\r\n" + 
				"				<statusCodes>\r\n" + 
				"					<code>XF</code>\r\n" + 
				"					<result>06</result>\r\n" + 
				"				</statusCodes>\r\n" + 
				"				<statusCodes>\r\n" + 
				"					<code>CV</code>\r\n" + 
				"					<result>Y</result>\r\n" + 
				"				</statusCodes>\r\n" + 
				"				<statusCodes>\r\n" + 
				"					<code>PG</code>\r\n" + 
				"					<result>Y</result>\r\n" + 
				"				</statusCodes>\r\n" + 
				"				<statusCodes>\r\n" + 
				"					<code>BC</code>\r\n" + 
				"					<result>01</result>\r\n" + 
				"				</statusCodes>\r\n" + 
				"				<statusCodes>\r\n" + 
				"					<code>RE</code>\r\n" + 
				"					<result>00</result>\r\n" + 
				"				</statusCodes>\r\n" + 
				"				<statusCodes>\r\n" + 
				"					<code>NP</code>\r\n" + 
				"					<result>Y</result>\r\n" + 
				"				</statusCodes>\r\n" + 
				"				<statusCodes>\r\n" + 
				"					<code>VP</code>\r\n" + 
				"					<result>1</result>\r\n" + 
				"				</statusCodes>\r\n" + 
				"				<statusCodes>\r\n" + 
				"					<code>EM</code>\r\n" + 
				"					<result>M</result>\r\n" + 
				"				</statusCodes>\r\n" + 
				"				<statusCodes>\r\n" + 
				"					<code>TA</code>\r\n" + 
				"					<result>P</result>\r\n" + 
				"				</statusCodes>\r\n" + 
				"				<statusCodes>\r\n" + 
				"					<code>SF</code>\r\n" + 
				"					<result>IF</result>\r\n" + 
				"				</statusCodes>\r\n" + 
				"			</statusCodesList>\r\n" + 
				"		</otherCardholders>\r\n" + 
				"	</otherCardholdersList>\r\n" + 
				"	<currentBalance>0.00</currentBalance>\r\n" + 
				"	<currentBalanceSign>+</currentBalanceSign>\r\n" + 
				"	<postedBalance>0.00</postedBalance>\r\n" + 
				"	<outstandingAuthorizations>0.00</outstandingAuthorizations>\r\n" + 
				"	<availableCash>1000.00</availableCash>\r\n" + 
				"	<availableCashPad>0.00</availableCashPad>\r\n" + 
				"	<cashLimit>1000.00</cashLimit>\r\n" + 
				"	<availableCredit>1500.00</availableCredit>\r\n" + 
				"	<availableCreditSign>+</availableCreditSign>\r\n" + 
				"	<availableCreditPad>0.00</availableCreditPad>\r\n" + 
				"	<overlimit>0.00</overlimit>\r\n" + 
				"	<creditLimit>1500.00</creditLimit>\r\n" + 
				"	<minimumPaymentDue>0</minimumPaymentDue>\r\n" + 
				"	<pastDue>0.00</pastDue>\r\n" + 
				"	<lastPayment>0.00</lastPayment>\r\n" + 
				"	<lastPurchase>0.00</lastPurchase>\r\n" + 
				"	<lastFinanceChargeAmount>0.00</lastFinanceChargeAmount>\r\n" + 
				"	<lastStatementBalance>0.00</lastStatementBalance>\r\n" + 
				"	<lastStatementBalanceSign>+</lastStatementBalanceSign>\r\n" + 
				"	<yearToDateInterestChgd>0.00</yearToDateInterestChgd>\r\n" + 
				"	<yearToDateInterestPd>0.00</yearToDateInterestPd>\r\n" + 
				"	<lastDisputeAmount>0.00</lastDisputeAmount>\r\n" + 
				"	<fixedPaymentAmount>0.00</fixedPaymentAmount>\r\n" + 
				"	<totalDue>0.00</totalDue>\r\n" + 
				"	<paymentDue>0.00</paymentDue>\r\n" + 
				"	<lastNSFAmount>0.00</lastNSFAmount>\r\n" + 
				"	<lastCashAdvanceAmount>0.00</lastCashAdvanceAmount>\r\n" + 
				"	<lastCreditTransactionAmount>0.00</lastCreditTransactionAmount>\r\n" + 
				"	<purchaseCTDAmount>0.00</purchaseCTDAmount>\r\n" + 
				"	<cashAdvanceCTDAmount>0.00</cashAdvanceCTDAmount>\r\n" + 
				"	<creditCTDAmount>0.00</creditCTDAmount>\r\n" + 
				"	<lastStatementBalDue>0.00</lastStatementBalDue>\r\n" + 
				"	<purchaseApr>25.99</purchaseApr>\r\n" + 
				"	<cashApr>27.99</cashApr>\r\n" + 
				"	<minPaymentDueAmt>0.00</minPaymentDueAmt>\r\n" + 
				"	<underivedOutstandingMinPaymentDue>0.00</underivedOutstandingMinPaymentDue>\r\n" + 
				"	<creditLimitDate>2019-06-17</creditLimitDate>\r\n" + 
				"	<paymentDueDate>2020-07-20</paymentDueDate>\r\n" + 
				"	<lastStatementDate>2020-07-14</lastStatementDate>\r\n" + 
				"	<openDate>2018-06-12</openDate>\r\n" + 
				"	<dateThirdPartyNameAdded>2020-07-09</dateThirdPartyNameAdded>\r\n" + 
				"	<dateLastRequest>2019-07-31</dateLastRequest>\r\n" + 
				"	<clientProductCode>OMC</clientProductCode>\r\n" + 
				"	<tsysProductCode>MC</tsysProductCode>\r\n" + 
				"	<type>P</type>\r\n" + 
				"	<solicitationFlag>N</solicitationFlag>\r\n" + 
				"	<productUpgradeCode>8044</productUpgradeCode>\r\n" + 
				"	<tuAuthenticationRequired>0</tuAuthenticationRequired>\r\n" + 
				"	<authorizationStatus>F</authorizationStatus>\r\n" + 
				"	<authorizationReason>0321</authorizationReason>\r\n" + 
				"	<chipCardIndicator>Y</chipCardIndicator>\r\n" + 
				"	<chipCardOptionSet>0025</chipCardOptionSet>\r\n" + 
				"	<electronicStatementFlag>N</electronicStatementFlag>\r\n" + 
				"	<suppressHardCopyFlag>N</suppressHardCopyFlag>\r\n" + 
				"	<idCompliantFlag>F</idCompliantFlag>\r\n" + 
				"	<cdf10>C</cdf10>\r\n" + 
				"	<loyaltyNumber>6365740011069595</loyaltyNumber>\r\n" + 
				"	<disclosureFlag>N</disclosureFlag>\r\n" + 
				"	<thirdPartyName>TESTING TESTER 3 KNOWS IT ALL</thirdPartyName>\r\n" + 
				"	<optOutOnlineOffer>N</optOutOnlineOffer>\r\n" + 
				"	<lastReqOperator>TESTER</lastReqOperator>\r\n" + 
				"	<lastReqReason>N</lastReqReason>\r\n" + 
				"	<custSegValue>0000000</custSegValue>\r\n" + 
				"	<custSegId>0000000</custSegId>\r\n" + 
				"	<disclosureGroup>M2599191</disclosureGroup>\r\n" + 
				"	<disclosureGroupDesc>OM* 25.99% - 2019 V1</disclosureGroupDesc>\r\n" + 
				"	<billingCycle>14</billingCycle>\r\n" + 
				"	<consecutiveDaysPastDue>0</consecutiveDaysPastDue>\r\n" + 
				"	<nsfCounter>0</nsfCounter>\r\n" + 
				"	<nbrStmtsLTD>0</nbrStmtsLTD>\r\n" + 
				"	<repaymentMonths>0</repaymentMonths>\r\n" + 
				"	<arqCounter>0</arqCounter>\r\n" + 
				"	<cardExpiryDate>823</cardExpiryDate>\r\n" + 
				"	<lastAccessDateTime>2020-08-12T09:27:13Z</lastAccessDateTime>\r\n" + 
				"	<nextStatementDate>2020-08-14</nextStatementDate>\r\n" + 
				"	<digitalFlagsList>\r\n" + 
				"		<digitalFlags>\r\n" + 
				"			<name>MOA</name>\r\n" + 
				"			<isEnrolled>Y</isEnrolled>\r\n" + 
				"		</digitalFlags>\r\n" + 
				"		<digitalFlags>\r\n" + 
				"			<name>Mpay</name>\r\n" + 
				"			<isEnrolled>N</isEnrolled>\r\n" + 
				"		</digitalFlags>\r\n" + 
				"		<digitalFlags>\r\n" + 
				"			<name>Alerts</name>\r\n" + 
				"			<isEnrolled>N</isEnrolled>\r\n" + 
				"		</digitalFlags>\r\n" + 
				"		<digitalFlags>\r\n" + 
				"			<name>Emerging Payments</name>\r\n" + 
				"			<isEnrolled>N</isEnrolled>\r\n" + 
				"		</digitalFlags>\r\n" + 
				"	</digitalFlagsList>\r\n" + 
				"	<outstandingCardRequest>false</outstandingCardRequest>\r\n" + 
				"</account>\r\n" + 
				"";
		
		JAXBContext jaxbcontext = JAXBContext.newInstance(Account.class);
		Account s2 = (Account)XML_TO_POJO_CONVERTER.xml_to_pojo(jaxbcontext, s1);
		System.out.println(s2.getAuthorizationReason());
		System.out.println(s2.getPaymentHistory().getPastDue180Nbr());
		System.out.println(s2.getAvailableCreditPad());
		System.out.println(s2.getPrimaryCardholder().getCardNbr());
	}
}