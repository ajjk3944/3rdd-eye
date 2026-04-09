.class final Lcom/ui/wmw/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/a$b;->a(Ljava/util/concurrent/atomic/AtomicInteger;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/a;

.field final synthetic b:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(Lcom/ui/wmw/a;Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/a$b$a;->a:Lcom/ui/wmw/a;

    iput-object p2, p0, Lcom/ui/wmw/a$b$a;->b:Lkotlin/jvm/internal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)LDj/a;
    .locals 3

    const-string v0, "tryNum"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wmw/a$b$a;->a:Lcom/ui/wmw/a;

    invoke-static {v0}, Lcom/ui/wmw/a;->c(Lcom/ui/wmw/a;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/a$b$a$a;

    iget-object v2, p0, Lcom/ui/wmw/a$b$a;->a:Lcom/ui/wmw/a;

    invoke-direct {v1, v2, p1}, Lcom/ui/wmw/a$b$a$a;-><init>(Lcom/ui/wmw/a;Ljava/lang/Integer;)V

    invoke-virtual {v0, v1}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    sget-object v0, Lcom/ui/wmw/a$b$a$b;->a:Lcom/ui/wmw/a$b$a$b;

    invoke-virtual {p1, v0}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wmw/a$b$a$c;

    iget-object v1, p0, Lcom/ui/wmw/a$b$a;->b:Lkotlin/jvm/internal/N;

    iget-object v2, p0, Lcom/ui/wmw/a$b$a;->a:Lcom/ui/wmw/a;

    invoke-direct {v0, v1, v2}, Lcom/ui/wmw/a$b$a$c;-><init>(Lkotlin/jvm/internal/N;Lcom/ui/wmw/a;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/a$b$a;->a(Ljava/lang/Integer;)LDj/a;

    move-result-object p1

    return-object p1
.end method
