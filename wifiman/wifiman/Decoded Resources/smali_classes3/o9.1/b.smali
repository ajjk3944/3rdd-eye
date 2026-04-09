.class public final Lo9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo9/b;

.field private static final b:Lkotlin/text/p;

.field private static final c:Lkotlin/text/p;

.field private static final d:Lkotlin/text/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo9/b;

    invoke-direct {v0}, Lo9/b;-><init>()V

    sput-object v0, Lo9/b;->a:Lo9/b;

    new-instance v0, Lkotlin/text/p;

    const-string/jumbo v1, "^[0-9]+$"

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo9/b;->b:Lkotlin/text/p;

    new-instance v0, Lkotlin/text/p;

    const-string/jumbo v1, "^[0-9a-zA-Z-]+$"

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo9/b;->c:Lkotlin/text/p;

    new-instance v0, Lkotlin/text/p;

    const-string/jumbo v1, "^v?(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:\\.(0|[1-9]\\d*))?(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$"

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo9/b;->d:Lkotlin/text/p;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lkotlin/text/p;
    .locals 1

    sget-object v0, Lo9/b;->d:Lkotlin/text/p;

    return-object v0
.end method

.method public final b()Lkotlin/text/p;
    .locals 1

    sget-object v0, Lo9/b;->c:Lkotlin/text/p;

    return-object v0
.end method

.method public final c()Lkotlin/text/p;
    .locals 1

    sget-object v0, Lo9/b;->b:Lkotlin/text/p;

    return-object v0
.end method
