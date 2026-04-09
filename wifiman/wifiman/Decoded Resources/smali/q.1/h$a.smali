.class final Lq/h$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lq/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq/h$a;

    invoke-direct {v0}, Lq/h$a;-><init>()V

    sput-object v0, Lq/h$a;->a:Lq/h$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln0/c;)Lr/s0;
    .locals 2

    sget-object v0, Lq/h$a$a;->a:Lq/h$a$a;

    new-instance v1, Lq/h$a$b;

    invoke-direct {v1, p1}, Lq/h$a$b;-><init>(Ln0/c;)V

    invoke-static {v0, v1}, Lr/u0;->a(Lmh/l;Lmh/l;)Lr/s0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln0/c;

    invoke-virtual {p0, p1}, Lq/h$a;->a(Ln0/c;)Lr/s0;

    move-result-object p1

    return-object p1
.end method
