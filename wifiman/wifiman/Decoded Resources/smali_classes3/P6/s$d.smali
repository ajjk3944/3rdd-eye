.class LP6/s$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP6/s;->L0(Lgg/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LP6/s;


# direct methods
.method constructor <init>(LP6/s;)V
    .locals 0

    iput-object p1, p0, LP6/s$d;->a:LP6/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)Lgg/s;
    .locals 3

    iget-object v0, p0, LP6/s$d;->a:LP6/s;

    iget-object v1, v0, LP6/s;->a:LP6/G;

    iget-object v2, v0, LP6/s;->b:Lgg/s;

    iget-object v0, v0, LP6/s;->c:Lgg/s;

    invoke-static {v1, v2, v0}, LP6/s;->i1(LP6/G;Lgg/s;Lgg/s;)Lgg/s;

    move-result-object v0

    invoke-virtual {v0}, Lgg/s;->v()Lgg/s;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lgg/s;->G0(J)Lgg/s;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LP6/s$d;->a(Ljava/lang/Boolean;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
