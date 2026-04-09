.class public interface abstract LW/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements LW/b;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW/c$a;
    }
.end annotation


# virtual methods
.method public subList(II)LW/c;
    .locals 1

    new-instance v0, LW/c$a;

    invoke-direct {v0, p0, p1, p2}, LW/c$a;-><init>(LW/c;II)V

    return-object v0
.end method
