.class public LP2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP2/e;


# static fields
.field private static final a:LP2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP2/g;

    invoke-direct {v0}, LP2/g;-><init>()V

    sput-object v0, LP2/g;->a:LP2/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()LP2/e;
    .locals 1

    sget-object v0, LP2/g;->a:LP2/g;

    return-object v0
.end method


# virtual methods
.method public a(LE2/c;LC2/g;)LE2/c;
    .locals 0

    return-object p1
.end method
