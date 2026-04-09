.class final Le9/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/d;->f(Le9/c$a$b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Le9/c$a$b;


# direct methods
.method constructor <init>(Le9/c$a$b;)V
    .locals 0

    iput-object p1, p0, Le9/d$f;->a:Le9/c$a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le9/c$b;)Z
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le9/d$f;->a:Le9/c$a$b;

    invoke-interface {v0, p1}, Le9/c$a$b;->b(Le9/c$b;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Le9/c$b;

    invoke-virtual {p0, p1}, Le9/d$f;->a(Le9/c$b;)Z

    move-result p1

    return p1
.end method
