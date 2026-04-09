.class public final LH/k$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:LH/k$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/k$c;

    invoke-direct {v0}, LH/k$c;-><init>()V

    sput-object v0, LH/k$c;->b:LH/k$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "TextFieldLineLimits.SingleLine"

    return-object v0
.end method
