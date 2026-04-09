.class final Lcom/ui/wifiman/model/wmw/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/c;-><init>(Lcc/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/wmw/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wmw/c$c;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wmw/c$c;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wmw/c$c;->a:Lcom/ui/wifiman/model/wmw/c$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lcom/ui/wifiman/model/wmw/b;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcc/a;

    if-nez p1, :cond_0

    sget-object p1, Lcom/ui/wifiman/model/wmw/b$b;->a:Lcom/ui/wifiman/model/wmw/b$b;

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcc/a;->d()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-object v0, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {p1}, Lcc/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcc/a;->f()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/ui/wifiman/model/wmw/b$a$a;

    invoke-direct {v1, p1, v0}, Lcom/ui/wifiman/model/wmw/b$a$a;-><init>(Ljava/lang/String;Lh9/a;)V

    :goto_0
    move-object p1, v1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Lcc/a;->d()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid adoption id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object v0, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {p1}, Lcc/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcc/a;->f()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/ui/wifiman/model/wmw/b$a$b;

    invoke-direct {v1, p1, v0}, Lcom/ui/wifiman/model/wmw/b$a$b;-><init>(Ljava/lang/String;Lh9/a;)V

    goto :goto_0

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/c$c;->a(Ll9/a;)Lcom/ui/wifiman/model/wmw/b;

    move-result-object p1

    return-object p1
.end method
