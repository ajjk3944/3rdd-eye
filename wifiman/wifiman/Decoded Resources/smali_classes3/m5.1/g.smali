.class public final synthetic Lm5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF4/g;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lm5/h$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lm5/h$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5/g;->a:Ljava/lang/String;

    iput-object p2, p0, Lm5/g;->b:Lm5/h$a;

    return-void
.end method


# virtual methods
.method public final a(LF4/d;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lm5/g;->a:Ljava/lang/String;

    iget-object v1, p0, Lm5/g;->b:Lm5/h$a;

    invoke-static {v0, v1, p1}, Lm5/h;->a(Ljava/lang/String;Lm5/h$a;LF4/d;)Lm5/f;

    move-result-object p1

    return-object p1
.end method
