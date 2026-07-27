/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
    // Check for null/undefined or invalid classFunction
    if (obj === null || obj === undefined || typeof classFunction !== 'function') {
        return false;
    }

    // Traverse the prototype chain of the object
    let proto = Object.getPrototypeOf(obj);
    
    while (proto !== null) {
        if (proto === classFunction.prototype) {
            return true;
        }
        proto = Object.getPrototypeOf(proto);
    }

    return false;
};

/**
 * checkIfInstanceOf(new Date(), Date); // true
 */
