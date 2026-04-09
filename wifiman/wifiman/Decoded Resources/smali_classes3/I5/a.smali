.class public final LI5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/w;
.implements Lgg/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI5/a$e;,
        LI5/a$b;,
        LI5/a$d;,
        LI5/a$c;,
        LI5/a$a;
    }
.end annotation


# static fields
.field private static final b:LI5/a;


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI5/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI5/a;-><init>(Ljava/lang/Object;)V

    sput-object v0, LI5/a;->b:LI5/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI5/a;->a:Ljava/lang/Object;

    return-void
.end method

.method public static e(Ljava/lang/Object;)LI5/a;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, LI5/a;

    invoke-direct {v0, p0}, LI5/a;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "defaultValue == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f()LI5/a;
    .locals 1

    sget-object v0, LI5/a;->b:LI5/a;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Lgg/i;)LDj/a;
    .locals 0

    invoke-virtual {p0, p1}, LI5/a;->c(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lgg/s;)Lgg/v;
    .locals 0

    invoke-virtual {p0, p1}, LI5/a;->d(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public c(Lgg/i;)Lgg/i;
    .locals 2

    new-instance v0, LI5/a$a;

    iget-object v1, p0, LI5/a;->a:Ljava/lang/Object;

    invoke-direct {v0, v1}, LI5/a$a;-><init>(Ljava/lang/Object;)V

    new-instance v1, LI5/a$b;

    invoke-virtual {p1, v0}, Lgg/i;->b0(LDj/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->t1()Lgg/i;

    move-result-object p1

    invoke-direct {v1, p1, v0}, LI5/a$b;-><init>(Lgg/i;LI5/a$a;)V

    return-object v1
.end method

.method public d(Lgg/s;)Lgg/s;
    .locals 2

    new-instance v0, LI5/a$a;

    iget-object v1, p0, LI5/a;->a:Ljava/lang/Object;

    invoke-direct {v0, v1}, LI5/a$a;-><init>(Ljava/lang/Object;)V

    new-instance v1, LI5/a$c;

    invoke-virtual {p1, v0}, Lgg/s;->B(Lgg/x;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->D0()Lgg/s;

    move-result-object p1

    invoke-direct {v1, p1, v0}, LI5/a$c;-><init>(Lgg/s;LI5/a$a;)V

    return-object v1
.end method
