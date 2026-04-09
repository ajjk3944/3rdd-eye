.class final Lcom/ui/wmw/a$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/a$b$a;->a(Ljava/lang/Integer;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/a;

.field final synthetic b:Ljava/lang/Integer;


# direct methods
.method constructor <init>(Lcom/ui/wmw/a;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/a$b$a$a;->a:Lcom/ui/wmw/a;

    iput-object p2, p0, Lcom/ui/wmw/a$b$a$a;->b:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wmw/a;Ljava/lang/Integer;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wmw/a$b$a$a;->c(Lcom/ui/wmw/a;Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/wmw/a;Ljava/lang/Integer;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WMW Connection "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " subscribed (try "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/a$b$a$a;->b(Lhg/c;)V

    return-void
.end method

.method public final b(Lhg/c;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wmw/a$b$a$a;->a:Lcom/ui/wmw/a;

    iget-object v0, p0, Lcom/ui/wmw/a$b$a$a;->b:Ljava/lang/Integer;

    new-instance v1, Lcom/ui/wmw/b;

    invoke-direct {v1, p1, v0}, Lcom/ui/wmw/b;-><init>(Lcom/ui/wmw/a;Ljava/lang/Integer;)V

    invoke-static {v1}, LNf/a;->d(Lmh/a;)V

    return-void
.end method
