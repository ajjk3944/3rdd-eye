.class final Lcom/google/android/gms/oss/licenses/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/oss/licenses/d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/oss/licenses/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/c;->a:Lcom/google/android/gms/oss/licenses/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/c;->a:Lcom/google/android/gms/oss/licenses/d;

    iget-object v0, v0, Lcom/google/android/gms/oss/licenses/d;->a:Lcom/google/android/gms/oss/licenses/OssLicensesActivity;

    invoke-static {v0}, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->V0(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/c;->a:Lcom/google/android/gms/oss/licenses/d;

    iget-object v1, v1, Lcom/google/android/gms/oss/licenses/d;->a:Lcom/google/android/gms/oss/licenses/OssLicensesActivity;

    invoke-static {v1}, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->T0(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/c;->a:Lcom/google/android/gms/oss/licenses/d;

    iget-object v1, v1, Lcom/google/android/gms/oss/licenses/d;->a:Lcom/google/android/gms/oss/licenses/OssLicensesActivity;

    invoke-static {v1}, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->V0(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/text/Layout;->getLineTop(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/c;->a:Lcom/google/android/gms/oss/licenses/d;

    iget-object v1, v1, Lcom/google/android/gms/oss/licenses/d;->a:Lcom/google/android/gms/oss/licenses/OssLicensesActivity;

    invoke-static {v1}, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->U0(Lcom/google/android/gms/oss/licenses/OssLicensesActivity;)Landroid/widget/ScrollView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/widget/ScrollView;->scrollTo(II)V

    return-void
.end method
