.class final Lre/g$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/g;-><init>(Ljava/lang/String;Lcom/ui/wifiman/model/wmw/WifimanWizard;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lre/g$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/g$g;

    invoke-direct {v0}, Lre/g$g;-><init>()V

    sput-object v0, Lre/g$g;->a:Lre/g$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lre/a$a;)I
    .locals 0

    invoke-static {p0}, Lre/g$g;->c(Lre/a$a;)I

    move-result p0

    return p0
.end method

.method private static final c(Lre/a$a;)I
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lre/a$a;->c()I

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lre/g$g;->b(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/Set;)Ljava/util/Set;
    .locals 1

    const-string v0, "aps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p1

    new-instance v0, Lre/k;

    invoke-direct {v0}, Lre/k;-><init>()V

    invoke-static {p1, v0}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    invoke-static {p1}, Lzi/m;->b0(Lzi/j;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
