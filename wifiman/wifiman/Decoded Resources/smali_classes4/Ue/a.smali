.class public final LUe/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LUe/a;

.field public static b:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LUe/a;

    invoke-direct {v0}, LUe/a;-><init>()V

    sput-object v0, LUe/a;->a:LUe/a;

    const/4 v0, 0x0

    sget-object v1, LUe/a$a;->a:LUe/a$a;

    const v2, -0x52bb6ef5

    invoke-static {v2, v0, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LUe/a;->b:Lmh/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/p;
    .locals 1

    sget-object v0, LUe/a;->b:Lmh/p;

    return-object v0
.end method
