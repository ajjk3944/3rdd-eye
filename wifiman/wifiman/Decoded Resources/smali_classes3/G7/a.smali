.class public final LG7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG7/a$a;
    }
.end annotation


# static fields
.field public static final a:LG7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG7/a;

    invoke-direct {v0}, LG7/a;-><init>()V

    sput-object v0, LG7/a;->a:LG7/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LG7/a$a;
    .locals 1

    new-instance v0, LG7/b;

    invoke-direct {v0}, LG7/b;-><init>()V

    return-object v0
.end method
