.class public final Landroidx/compose/ui/platform/C1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/C1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Landroidx/compose/ui/platform/C1$a;

.field private static b:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/C1$a;

    invoke-direct {v0}, Landroidx/compose/ui/platform/C1$a;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/C1$a;->a:Landroidx/compose/ui/platform/C1$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/l;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/C1$a;->b:Lmh/l;

    return-object v0
.end method
