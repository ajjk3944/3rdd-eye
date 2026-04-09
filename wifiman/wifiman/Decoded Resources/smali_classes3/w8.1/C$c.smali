.class final Lw8/C$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/C;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lw8/C$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw8/C$c;

    invoke-direct {v0}, Lw8/C$c;-><init>()V

    sput-object v0, Lw8/C$c;->a:Lw8/C$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmd/a;)LT7/c;
    .locals 1

    const-string/jumbo v0, "settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lmd/a;->g()LT7/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmd/a;

    invoke-virtual {p0, p1}, Lw8/C$c;->a(Lmd/a;)LT7/c;

    move-result-object p1

    return-object p1
.end method
