.class final LE0/g$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/g$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE0/g$a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE0/g$a$b;

    invoke-direct {v0}, LE0/g$a$b;-><init>()V

    sput-object v0, LE0/g$a$b;->a:LE0/g$a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/g;LY0/d;)V
    .locals 0

    invoke-interface {p1, p2}, LE0/g;->a(LY0/d;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/g;

    check-cast p2, LY0/d;

    invoke-virtual {p0, p1, p2}, LE0/g$a$b;->a(LE0/g;LY0/d;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
