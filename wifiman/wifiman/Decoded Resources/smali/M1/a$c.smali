.class LM1/a$c;
.super LG1/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic b:LM1/a;


# direct methods
.method constructor <init>(LM1/a;)V
    .locals 0

    iput-object p1, p0, LM1/a$c;->b:LM1/a;

    invoke-direct {p0}, LG1/u;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)LG1/t;
    .locals 1

    iget-object v0, p0, LM1/a$c;->b:LM1/a;

    invoke-virtual {v0, p1}, LM1/a;->H(I)LG1/t;

    move-result-object p1

    invoke-static {p1}, LG1/t;->V(LG1/t;)LG1/t;

    move-result-object p1

    return-object p1
.end method

.method public d(I)LG1/t;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LM1/a$c;->b:LM1/a;

    iget p1, p1, LM1/a;->k:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, LM1/a$c;->b:LM1/a;

    iget p1, p1, LM1/a;->l:I

    :goto_0
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, LM1/a$c;->b(I)LG1/t;

    move-result-object p1

    return-object p1
.end method

.method public f(IILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, LM1/a$c;->b:LM1/a;

    invoke-virtual {v0, p1, p2, p3}, LM1/a;->P(IILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
