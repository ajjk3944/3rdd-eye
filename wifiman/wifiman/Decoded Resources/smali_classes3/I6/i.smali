.class public LI6/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LI6/i;

.field public static final c:LI6/i;

.field public static final d:LI6/i;


# instance fields
.field final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI6/i;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, LI6/i;-><init>(I)V

    sput-object v0, LI6/i;->b:LI6/i;

    new-instance v0, LI6/i;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, LI6/i;-><init>(I)V

    sput-object v0, LI6/i;->c:LI6/i;

    new-instance v0, LI6/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI6/i;-><init>(I)V

    sput-object v0, LI6/i;->d:LI6/i;

    return-void
.end method

.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LI6/i;->a:I

    return-void
.end method
