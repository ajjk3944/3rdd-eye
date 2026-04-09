.class LSh/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# static fields
.field public static final a:LSh/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSh/c;

    invoke-direct {v0}, LSh/c;-><init>()V

    sput-object v0, LSh/c;->a:LSh/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LSh/g;

    check-cast p2, LSh/A;

    invoke-static {p1, p2}, LSh/d;->D(LSh/g;LSh/A;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
