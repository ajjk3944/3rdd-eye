.class public final Lx/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lx/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx/j$a;

    invoke-direct {v0}, Lx/j$a;-><init>()V

    sput-object v0, Lx/j$a;->a:Lx/j$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IIIIII)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Start"

    return-object v0
.end method
