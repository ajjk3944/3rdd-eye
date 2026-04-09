.class final LD8/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/a;->r0(Ldf/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD8/a$e$a;
    }
.end annotation


# instance fields
.field final synthetic a:Ldf/b;


# direct methods
.method constructor <init>(Ldf/b;)V
    .locals 0

    iput-object p1, p0, LD8/a$e;->a:Ldf/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;)Lgg/r;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LWc/b;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;

    iget-object v0, p0, LD8/a$e;->a:Ldf/b;

    new-instance v1, LD8/a$e$b;

    invoke-direct {v1, v0, p1}, LD8/a$e$b;-><init>(Ldf/b;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;)V

    invoke-static {v1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    invoke-virtual {p0, p1}, LD8/a$e;->a(LWc/b;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
