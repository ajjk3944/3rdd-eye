.class Lxi/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lxi/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxi/e;

    invoke-direct {v0}, Lxi/e;-><init>()V

    sput-object v0, Lxi/e;->a:Lxi/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lxi/j;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
