.class final Le9/d$e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/d$e;->b(Le9/c$a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Le9/d;

.field final synthetic b:Le9/c$a;


# direct methods
.method constructor <init>(Le9/d;Le9/c$a;)V
    .locals 0

    iput-object p1, p0, Le9/d$e$d;->a:Le9/d;

    iput-object p2, p0, Le9/d$e$d;->b:Le9/c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Le9/d$e$d$a;

    iget-object v0, p0, Le9/d$e$d;->a:Le9/d;

    iget-object v1, p0, Le9/d$e$d;->b:Le9/c$a;

    invoke-direct {p1, v0, v1}, Le9/d$e$d$a;-><init>(Le9/d;Le9/c$a;)V

    invoke-static {p1}, Lf9/a;->b(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, Le9/d$e$d;->a(Lhg/c;)V

    return-void
.end method
