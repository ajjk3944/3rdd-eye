.class final synthetic Lzi/x$c;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzi/x;->H(Lzi/j;Lmh/l;)Lzi/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final a:Lzi/x$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzi/x$c;

    invoke-direct {v0}, Lzi/x$c;-><init>()V

    sput-object v0, Lzi/x$c;->a:Lzi/x$c;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "iterator()Ljava/util/Iterator;"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lzi/j;

    const-string v3, "iterator"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lzi/j;)Ljava/util/Iterator;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzi/j;

    invoke-virtual {p0, p1}, Lzi/x$c;->a(Lzi/j;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
