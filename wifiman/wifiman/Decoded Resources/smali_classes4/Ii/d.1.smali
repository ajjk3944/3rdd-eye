.class final LIi/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIi/L0;


# static fields
.field public static final a:LIi/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LIi/d;

    invoke-direct {v0}, LIi/d;-><init>()V

    sput-object v0, LIi/d;->a:LIi/d;

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

    const-string v0, "Active"

    return-object v0
.end method
