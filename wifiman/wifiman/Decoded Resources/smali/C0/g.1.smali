.class public final LC0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LC0/g;

.field public static b:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LC0/g;

    invoke-direct {v0}, LC0/g;-><init>()V

    sput-object v0, LC0/g;->a:LC0/g;

    const/4 v0, 0x0

    sget-object v1, LC0/g$a;->a:LC0/g$a;

    const v2, -0x67cddd26

    invoke-static {v2, v0, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LC0/g;->b:Lmh/p;

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

    sget-object v0, LC0/g;->b:Lmh/p;

    return-object v0
.end method
