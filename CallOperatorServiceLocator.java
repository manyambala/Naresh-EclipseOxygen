/**
 * CallOperatorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class CallOperatorServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.CallOperatorService {

    public CallOperatorServiceLocator() {
    }


    public CallOperatorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CallOperatorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CallOperator
    private java.lang.String CallOperator_address = "http://localhost:8080/CallServerService/services/CallOperator";

    public java.lang.String getCallOperatorAddress() {
        return CallOperator_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CallOperatorWSDDServiceName = "CallOperator";

    public java.lang.String getCallOperatorWSDDServiceName() {
        return CallOperatorWSDDServiceName;
    }

    public void setCallOperatorWSDDServiceName(java.lang.String name) {
        CallOperatorWSDDServiceName = name;
    }

    public DefaultNamespace.CallOperator getCallOperator() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CallOperator_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCallOperator(endpoint);
    }

    public DefaultNamespace.CallOperator getCallOperator(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.CallOperatorSoapBindingStub _stub = new DefaultNamespace.CallOperatorSoapBindingStub(portAddress, this);
            _stub.setPortName(getCallOperatorWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCallOperatorEndpointAddress(java.lang.String address) {
        CallOperator_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.CallOperator.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.CallOperatorSoapBindingStub _stub = new DefaultNamespace.CallOperatorSoapBindingStub(new java.net.URL(CallOperator_address), this);
                _stub.setPortName(getCallOperatorWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CallOperator".equals(inputPortName)) {
            return getCallOperator();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "CallOperatorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "CallOperator"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CallOperator".equals(portName)) {
            setCallOperatorEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
