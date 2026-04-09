.class public abstract Lp6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/a$a;,
        Lp6/a$b;
    }
.end annotation


# static fields
.field public static final b:Lp6/a$a;

.field private static final c:Lp6/a;

.field private static final d:Lp6/a;


# instance fields
.field private final a:Lp6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp6/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp6/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lp6/a;->b:Lp6/a$a;

    new-instance v0, Lp6/a$b;

    const/16 v1, 0x64

    sget-object v2, Lp6/e;->a:Lp6/e;

    invoke-direct {v0, v1, v2}, Lp6/a$b;-><init>(ILp6/c;)V

    sput-object v0, Lp6/a;->c:Lp6/a;

    new-instance v0, Lp6/a$b;

    const/4 v1, 0x0

    sget-object v2, Lp6/f;->a:Lp6/f;

    invoke-direct {v0, v1, v2}, Lp6/a$b;-><init>(ILp6/c;)V

    sput-object v0, Lp6/a;->d:Lp6/a;

    return-void
.end method

.method private constructor <init>(Lp6/c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lp6/a;->a:Lp6/c;

    return-void
.end method

.method public synthetic constructor <init>(Lp6/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lp6/a;-><init>(Lp6/c;)V

    return-void
.end method


# virtual methods
.method public abstract a(FF)F
.end method

.method public final b()Lp6/c;
    .locals 1

    iget-object v0, p0, Lp6/a;->a:Lp6/c;

    return-object v0
.end method
