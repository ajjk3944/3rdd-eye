.class public final LT/g0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic a:LT/g0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT/g0$b;

    invoke-direct {v0}, LT/g0$b;-><init>()V

    sput-object v0, LT/g0$b;->a:LT/g0$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
