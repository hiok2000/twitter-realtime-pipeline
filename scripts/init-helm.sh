kubectl --namespace kube-system create sa tiller
kubectl create clusterrolebinding tiller \
    --clusterrole cluster-admin \
    --serviceaccount=kube-system:tiller
helm init --service-account tiller
helm repo update
helm repo add incubator http://storage.googleapis.com/kubernetes-charts-incubator
kubectl get deploy,svc tiller-deploy -n kube-system

