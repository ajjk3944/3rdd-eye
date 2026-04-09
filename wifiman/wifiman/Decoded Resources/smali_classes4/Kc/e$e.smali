.class final LKc/e$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKc/e;-><init>(LKc/a$a;Lgg/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LKc/e;


# direct methods
.method constructor <init>(LKc/e;)V
    .locals 0

    iput-object p1, p0, LKc/e$e;->a:LKc/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/D;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LKc/e$e;->a:LKc/e;

    invoke-static {v0, p1}, LKc/e;->k(LKc/e;Ljava/lang/String;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LKc/e$e;->a(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
