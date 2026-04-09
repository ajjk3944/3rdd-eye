.class final LSd/e$r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e$r;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LSd/e$b$a;


# direct methods
.method constructor <init>(LSd/e$b$a;)V
    .locals 0

    iput-object p1, p0, LSd/e$r$a;->a:LSd/e$b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Ll9/a;
    .locals 9

    const-string v0, "certs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    iget-object v1, p0, LSd/e$r$a;->a:LSd/e$b$a;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p1

    invoke-static/range {v1 .. v8}, LSd/e$b$a;->b(LSd/e$b$a;Ljava/lang/String;Lh9/a;Linet/ipaddr/g;Ljava/lang/String;Ljava/util/Set;ILjava/lang/Object;)LSd/e$b$a;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, LSd/e$r$a;->a(Ljava/util/Set;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
