.class public final synthetic Ljb/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Ldb/a;

.field public final synthetic b:Ljb/m;


# direct methods
.method public synthetic constructor <init>(Ldb/a;Ljb/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/k;->a:Ldb/a;

    iput-object p2, p0, Ljb/k;->b:Ljb/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ljb/k;->a:Ldb/a;

    iget-object v1, p0, Ljb/k;->b:Ljb/m;

    invoke-static {v0, v1}, Ljb/m;->a(Ldb/a;Ljb/m;)Lgg/n;

    move-result-object v0

    return-object v0
.end method
