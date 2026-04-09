.class final LE8/k$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/k;-><init>(Lgg/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/k$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/k$g;

    invoke-direct {v0}, LE8/k$g;-><init>()V

    sput-object v0, LE8/k$g;->a:LE8/k$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lnf/c;Lnf/c;)Lnf/c;
    .locals 8

    const-string/jumbo v0, "previous"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lnf/c;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lnf/c;->b(Lnf/c;ZLnf/g;Ls9/d;Ls9/d;ILjava/lang/Object;)Lnf/c;

    move-result-object p2

    :goto_0
    return-object p2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnf/c;

    check-cast p2, Lnf/c;

    invoke-virtual {p0, p1, p2}, LE8/k$g;->a(Lnf/c;Lnf/c;)Lnf/c;

    move-result-object p1

    return-object p1
.end method
