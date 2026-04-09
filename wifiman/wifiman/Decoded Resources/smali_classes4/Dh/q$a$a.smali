.class LDh/q$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDh/q$a;-><init>(LDh/q;Loi/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LDh/q;

.field final synthetic b:LDh/q$a;


# direct methods
.method constructor <init>(LDh/q$a;LDh/q;)V
    .locals 0

    iput-object p1, p0, LDh/q$a$a;->b:LDh/q$a;

    iput-object p2, p0, LDh/q$a$a;->a:LDh/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LZh/f;)Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LDh/q$a$a;->b:LDh/q$a;

    invoke-static {v0, p1}, LDh/q$a;->i(LDh/q$a;LZh/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZh/f;

    invoke-virtual {p0, p1}, LDh/q$a$a;->a(LZh/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
