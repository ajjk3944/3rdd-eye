.class final LSd/e$B$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e$B;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LSd/e$b$b;

.field final synthetic b:LSd/e;


# direct methods
.method constructor <init>(LSd/e$b$b;LSd/e;)V
    .locals 0

    iput-object p1, p0, LSd/e$B$a;->a:LSd/e$b$b;

    iput-object p2, p0, LSd/e$B$a;->b:LSd/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LLd/e;

    if-nez p1, :cond_0

    sget-object p1, LSd/e$c$b$c;->a:LSd/e$c$b$c;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, LLd/e;->c()Lcom/ui/wifiman/model/ubiquiti/console/f;

    move-result-object p1

    iget-object v0, p0, LSd/e$B$a;->a:LSd/e$b$b;

    invoke-virtual {v0}, LSd/e$b$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ui/wifiman/model/ubiquiti/console/f;->b(Ljava/lang/String;)Lgg/i;

    move-result-object p1

    new-instance v0, LSd/e$B$a$a;

    iget-object v1, p0, LSd/e$B$a;->a:LSd/e$b$b;

    invoke-direct {v0, v1}, LSd/e$B$a$a;-><init>(LSd/e$b$b;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, LSd/e$c$b$a;->a:LSd/e$c$b$a;

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    new-instance v0, LSd/e$B$a$b;

    iget-object v1, p0, LSd/e$B$a;->b:LSd/e;

    invoke-direct {v0, v1}, LSd/e$B$a$b;-><init>(LSd/e;)V

    invoke-virtual {p1, v0}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LSd/e$B$a;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
