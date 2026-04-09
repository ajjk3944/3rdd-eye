.class final Lzi/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/j;
.implements Lzi/e;


# static fields
.field public static final a:Lzi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzi/f;

    invoke-direct {v0}, Lzi/f;-><init>()V

    sput-object v0, Lzi/f;->a:Lzi/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(I)Lzi/j;
    .locals 0

    invoke-virtual {p0, p1}, Lzi/f;->d(I)Lzi/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(I)Lzi/j;
    .locals 0

    invoke-virtual {p0, p1}, Lzi/f;->c(I)Lzi/f;

    move-result-object p1

    return-object p1
.end method

.method public c(I)Lzi/f;
    .locals 0

    sget-object p1, Lzi/f;->a:Lzi/f;

    return-object p1
.end method

.method public d(I)Lzi/f;
    .locals 0

    sget-object p1, Lzi/f;->a:Lzi/f;

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    sget-object v0, LZg/I;->a:LZg/I;

    return-object v0
.end method
