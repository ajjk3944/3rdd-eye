.class public final Lo0/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lo0/f$a;

.field private static final b:I

.field private static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo0/f$a;

    invoke-direct {v0}, Lo0/f$a;-><init>()V

    sput-object v0, Lo0/f$a;->a:Lo0/f$a;

    sget-object v0, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {v0}, Lm0/d0$a;->B()I

    move-result v0

    sput v0, Lo0/f$a;->b:I

    sget-object v0, Lm0/E0;->a:Lm0/E0$a;

    invoke-virtual {v0}, Lm0/E0$a;->a()I

    move-result v0

    sput v0, Lo0/f$a;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    sget v0, Lo0/f$a;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    sget v0, Lo0/f$a;->c:I

    return v0
.end method
