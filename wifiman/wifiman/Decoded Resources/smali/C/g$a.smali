.class public final LC/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LC/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC/g$a;

    invoke-direct {v0}, LC/g$a;-><init>()V

    sput-object v0, LC/g$a;->a:LC/g$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LY0/d;II)I
    .locals 0

    return p2
.end method
