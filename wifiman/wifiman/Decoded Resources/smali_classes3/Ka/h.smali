.class public final LKa/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKa/h$a;,
        LKa/h$b;
    }
.end annotation


# static fields
.field public static final a:LKa/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LKa/h;

    invoke-direct {v0}, LKa/h;-><init>()V

    sput-object v0, LKa/h;->a:LKa/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LKa/h$a;
    .locals 1

    new-instance v0, LKa/i;

    invoke-direct {v0}, LKa/i;-><init>()V

    return-object v0
.end method
