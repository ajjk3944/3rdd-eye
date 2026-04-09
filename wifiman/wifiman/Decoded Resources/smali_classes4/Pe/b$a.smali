.class public final LPe/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPe/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LPe/b$a;

.field private static final b:Ls9/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LPe/b$a;

    invoke-direct {v0}, LPe/b$a;-><init>()V

    sput-object v0, LPe/b$a;->a:LPe/b$a;

    new-instance v0, Ls9/c$a;

    sget v1, Lm8/a;->t0:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LPe/b$a;->b:Ls9/c$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ls9/c$a;
    .locals 1

    sget-object v0, LPe/b$a;->b:Ls9/c$a;

    return-object v0
.end method
