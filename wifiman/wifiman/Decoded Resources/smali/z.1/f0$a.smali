.class public final Lz/f0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lz/f0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz/f0$a;

    invoke-direct {v0}, Lz/f0$a;-><init>()V

    sput-object v0, Lz/f0$a;->a:Lz/f0$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
