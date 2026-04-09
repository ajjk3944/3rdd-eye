.class Lcc/c$b;
.super Lm2/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcc/c;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcc/c;


# direct methods
.method constructor <init>(Lcc/c;Lm2/q;)V
    .locals 0

    iput-object p1, p0, Lcc/c$b;->d:Lcc/c;

    invoke-direct {p0, p2}, Lm2/w;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM wifimanWizardAdoption"

    return-object v0
.end method
