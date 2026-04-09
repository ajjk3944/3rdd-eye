.class public final Lrj/N5$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj/N5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lrj/N5$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrj/N5$a;

    invoke-direct {v0}, Lrj/N5$a;-><init>()V

    sput-object v0, Lrj/N5$a;->a:Lrj/N5$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
