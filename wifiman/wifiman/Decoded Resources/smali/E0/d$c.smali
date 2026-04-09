.class final LE0/d$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE0/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE0/d$c;

    invoke-direct {v0}, LE0/d$c;-><init>()V

    sput-object v0, LE0/d$c;->a:LE0/d$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/c;)V
    .locals 0

    invoke-virtual {p1}, LE0/c;->J2()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/c;

    invoke-virtual {p0, p1}, LE0/d$c;->a(LE0/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
