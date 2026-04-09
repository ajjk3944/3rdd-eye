.class final LJ0/q$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ0/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LJ0/q$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ0/q$c;

    invoke-direct {v0}, LJ0/q$c;-><init>()V

    sput-object v0, LJ0/q$c;->a:LJ0/q$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lg0/l;Lg0/l;)Lg0/l;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    invoke-static {p2}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, LJ0/q$c;->a(Lg0/l;Lg0/l;)Lg0/l;

    return-object p1
.end method
