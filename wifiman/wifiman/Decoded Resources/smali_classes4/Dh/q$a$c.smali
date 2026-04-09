.class LDh/q$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


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

    iput-object p1, p0, LDh/q$a$c;->b:LDh/q$a;

    iput-object p2, p0, LDh/q$a$c;->a:LDh/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LDh/q$a$c;->b:LDh/q$a;

    invoke-static {v0}, LDh/q$a;->k(LDh/q$a;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDh/q$a$c;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
