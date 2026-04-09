.class final Ln8/j$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/j;->t0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln8/j$j$b;
    }
.end annotation


# instance fields
.field final synthetic a:Ln8/j;


# direct methods
.method constructor <init>(Ln8/j;)V
    .locals 0

    iput-object p1, p0, Ln8/j$j;->a:Ln8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le8/a;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "managerApp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln8/j$j$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ln8/j$j;->a:Ln8/j;

    invoke-static {v0}, Ln8/j;->F0(Ln8/j;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Ln8/j$j$a;

    iget-object v2, p0, Ln8/j$j;->a:Ln8/j;

    invoke-direct {v1, v2, p1}, Ln8/j$j$a;-><init>(Ln8/j;Le8/a;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln8/j$j;->a:Ln8/j;

    invoke-static {v0}, Ln8/j;->G0(Ln8/j;)Li8/a;

    move-result-object v0

    new-instance v2, Li8/a$b$m;

    invoke-virtual {p1}, Le8/a;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Li8/a$b$m;-><init>(Ljava/lang/String;)V

    new-array p1, v1, [Li8/a$b;

    const/4 v1, 0x0

    aput-object v2, p1, v1

    invoke-interface {v0, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le8/a;

    invoke-virtual {p0, p1}, Ln8/j$j;->a(Le8/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
