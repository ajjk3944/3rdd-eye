.class public final LK2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/k;


# static fields
.field private static final b:LC2/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK2/j;

    invoke-direct {v0}, LK2/j;-><init>()V

    sput-object v0, LK2/j;->b:LC2/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()LK2/j;
    .locals 1

    sget-object v0, LK2/j;->b:LC2/k;

    check-cast v0, LK2/j;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method

.method public b(Landroid/content/Context;LE2/c;II)LE2/c;
    .locals 0

    return-object p2
.end method
