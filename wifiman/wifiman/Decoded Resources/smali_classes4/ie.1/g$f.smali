.class final Lie/g$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lie/g;-><init>(Lle/g;Ldc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lie/g$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lie/g$f;

    invoke-direct {v0}, Lie/g$f;-><init>()V

    sput-object v0, Lie/g$f;->a:Lie/g$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lie/g$b;)Lie/d;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lie/g$b;->b()Lie/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lie/g$b;

    invoke-virtual {p0, p1}, Lie/g$f;->a(Lie/g$b;)Lie/d;

    move-result-object p1

    return-object p1
.end method
